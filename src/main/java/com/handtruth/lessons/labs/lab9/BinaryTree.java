package com.handtruth.lessons.labs.lab9;

import java.util.Stack;

public class BinaryTree {

    private Node rootNode; // корневой узел

    public BinaryTree() { // Пустое дерево
        rootNode = null;
    }

    public Node findNodeByValue(int value) { // поиск узла по значению
        Node currentNode = rootNode; // начинаем поиск с корневого узла
        while (currentNode.getValue() != value) { // поиск покуда не будет найден элемент или не будут перебраны все
            if (value < currentNode.getValue()) { // движение влево?
                currentNode = currentNode.getleft();
            } else { //движение вправо
                currentNode = currentNode.getright();
            }
            if (currentNode == null) { // если потомка нет,
                return null; // возвращаем null
            }
        }
        return currentNode; // возвращаем найденный элемент
    }

    public void insertNode(int value) { // метод вставки нового элемента
        Node newNode = new Node(); // создание нового узла
        newNode.setValue(value); // вставка данных
        if (rootNode == null) { // если корневой узел не существует
            rootNode = newNode;// то новый элемент и есть корневой узел
        } else { // корневой узел занят
            Node currentNode = rootNode; // начинаем с корневого узла
            Node parentNode;
            while (true) // мы имеем внутренний выход из цикла
            {
                parentNode = currentNode;
                if (value == currentNode.getValue()) {   // если такой элемент в дереве уже есть, не сохраняем его
                    return;    // просто выходим из метода
                } else if (value < currentNode.getValue()) {   // движение влево?
                    currentNode = currentNode.getleft();
                    if (currentNode == null) { // если был достигнут конец цепочки,
                        parentNode.setleft(newNode); //  то вставить слева и выйти из методы
                        return;
                    }
                } else { // Или направо?
                    currentNode = currentNode.getright();
                    if (currentNode == null) { // если был достигнут конец цепочки,
                        parentNode.setright(newNode);  //то вставить справа
                        return; // и выйти
                    }
                }
            }
        }
    }

    public boolean deleteNode(int value) // Удаление узла с заданным ключом
    {
        Node currentNode = rootNode;
        Node parentNode = rootNode;
        boolean isleft = true;
        while (currentNode.getValue() != value) { // начинаем поиск узла
            parentNode = currentNode;
            if (value < currentNode.getValue()) { // Определяем, нужно ли движение влево?
                isleft = true;
                currentNode = currentNode.getleft();
            } else { // или движение вправо?
                isleft = false;
                currentNode = currentNode.getright();
            }
            if (currentNode == null)
                return false; // yзел не найден
        }

        if (currentNode.getleft() == null && currentNode.getright() == null) { // узел просто удаляется, если не имеет потомков
            if (currentNode == rootNode) // если узел - корень, то дерево очищается
                rootNode = null;
            else if (isleft)
                parentNode.setleft(null); // если нет - узел отсоединяется, от родителя
            else
                parentNode.setright(null);
        } else if (currentNode.getright() == null) { // узел заменяется левым поддеревом, если правого потомка нет
            if (currentNode == rootNode)
                rootNode = currentNode.getleft();
            else if (isleft)
                parentNode.setleft(currentNode.getleft());
            else
                parentNode.setright(currentNode.getleft());
        } else if (currentNode.getleft() == null) { // узел заменяется правым поддеревом, если левого потомка нет
            if (currentNode == rootNode)
                rootNode = currentNode.getright();
            else if (isleft)
                parentNode.setleft(currentNode.getright());
            else
                parentNode.setright(currentNode.getright());
        } else { // если есть два потомка, узел заменяется преемником
            Node heir = receiveHeir(currentNode);// поиск преемника для удаляемого узла
            Node temp = currentNode.getleft();
            if (currentNode == rootNode)
                rootNode = heir;
            else if (isleft) {
                parentNode.setleft(heir);
                heir.setleft(temp);
            } else
                parentNode.setright(heir);
        }
        return true; // элемент успешно удалён
    }

    // метод возвращает узел со следующим значением после передаваемого аргументом.
    // для этого он сначала переходим к правому потомку, а затем
    // отслеживаем цепочку левых потомков этого узла.
    private Node receiveHeir(Node node) {
        Node parentNode = node;
        Node heirNode = node;
        Node currentNode = node.getright(); // Переход к правому потомку
        while (currentNode != null) // Пока остаются левые потомки
        {
            parentNode = heirNode;// потомка задаём как текущий узел
            heirNode = currentNode;
            currentNode = currentNode.getleft(); // переход к левому потомку
        }
        // Если преемник не является
        if (heirNode != node.getright()) // правым потомком,
        { // создать связи между узлами
            parentNode.setleft(heirNode.getright());
            heirNode.setright(node.getright());
        }
        return heirNode;// возвращаем приемника
    }

    public void printTree() { // метод для вывода дерева в консоль
        Stack<Node> globalStack = new Stack<>(); // общий стек для значений дерева
        globalStack.push(rootNode);
        int gaps = 32; // начальное значение расстояния между элементами
        boolean isRowEmpty = false;
        String separator = "-----------------------------------------------------------------";
        System.out.println(separator);// черта для указания начала нового дерева
        while (!isRowEmpty) {
            Stack<Node> localStack = new Stack<>(); // локальный стек для задания потомков элемента
            isRowEmpty = true;

            for (int j = 0; j < gaps; j++)
                System.out.print(' ');
            while (!globalStack.isEmpty()) { // покуда в общем стеке есть элементы
                Node temp = globalStack.pop(); // берем следующий, при этом удаляя его из стека
                if (temp != null) {
                    System.out.print(temp.getValue()); // выводим его значение в консоли
                    localStack.push(temp.getleft()); // соохраняем в локальный стек, наследники текущего элемента
                    localStack.push(temp.getright());
                    if (temp.getleft() != null ||
                            temp.getright() != null)
                        isRowEmpty = false;
                } else {
                    System.out.print("__");// - если элемент пустой
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < gaps * 2 - 2; j++)
                    System.out.print(' ');
            }
            System.out.println();
            gaps /= 2;// при переходе на следующий уровень расстояние между элементами каждый раз уменьшается
            while (!localStack.isEmpty())
                globalStack.push(localStack.pop()); // перемещаем все элементы из локального стека в глобальный
        }
        System.out.println(separator);// подводим черту
    }


    static class Node {
        private int value; // ключ узла
        private Node left; // Левый узел потомок
        private Node right; // Правый узел потомок

        public void printNode() { // Вывод значения узла в консоль
            System.out.println(" Выбранный узел имеет значение :" + value);
        }

        public int getValue() {
            return this.value;
        }

        public void setValue(final int value) {
            this.value = value;
        }

        public Node getleft() {
            return this.left;
        }

        public void setleft(final Node left) {
            this.left = left;
        }

        public Node getright() {
            return this.right;
        }

        public void setright(final Node right) {
            this.right = right;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}
