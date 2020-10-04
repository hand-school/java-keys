package com.handtruth.lessons.lesson5.task3;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import com.handtruth.lessons.utils.TextGenerator;

import static com.handtruth.lessons.lesson5.task3.TextFileParse.countWords;
import static com.handtruth.lessons.lesson5.task3.TextFileParse.parseMails;
import static com.handtruth.lessons.lesson5.task3.TextFileParse.parsePhoneNumber;
import static com.handtruth.lessons.lesson5.task3.TextFileParse.rewriteFile;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TextFileParseTest {

    @Test
    @Tag("Normal")
    void parsePhoneNumberTest() {
        assertTrue(parsePhoneNumber("+7 (928) 000-22-31"));
        assertTrue(parsePhoneNumber("+8 (800) 555-35-35"));
        assertTrue(parsePhoneNumber("+807 (000) 328-07-39"));
        assertFalse(parsePhoneNumber("+42 (00) 328-07-39"));
        assertFalse(parsePhoneNumber("+6 (778) 32-07-69"));
        assertFalse(parsePhoneNumber("+6 (778) 3220769"));
    }

    @Test
    @Tag("Hard")
    void parseMailsTest(@TempDir File tempDir) throws IOException {
        // need to be rewritten
        File file = Paths.get("src", "test", "resources", "lesson5", "mail_test_empty").toFile();
        assertEquals(new ArrayList<String>(), parseMails(file.getAbsolutePath()));

        File testFile2 = new File(tempDir, "test_tmp");
        TextGenerator textGenerator = new TextGenerator();
        assertEquals(textGenerator.generateTestMailFile(testFile2), parseMails(testFile2.getPath()));
    }

    @Test
    @Tag("Hard")
    void countWordsTest() {
        File file = Paths.get("src", "test", "resources", "lesson5", "count_w_test1").toFile();
        assertEquals(Arrays.asList(6, 6, 7, 8, 9), countWords(file.getAbsolutePath()));
    }

    @Test
    @Tag("Normal")
    void rewriteFileTest(@TempDir File tempDir) throws IOException {
        File file = Paths.get("src", "test", "resources", "lesson5", "rewrite_file_test").toFile();
        File copyFile = new File(tempDir, "copy");
        if (!copyFile.createNewFile()) {
            throw new IOException("some weird shit");
        }
        rewriteFile(file.getAbsolutePath(), copyFile.getAbsolutePath());

        byte[] f1 = Files.readAllBytes(file.toPath());
        byte[] f2 = Files.readAllBytes(copyFile.toPath());

        assertEquals(f1, f2);
    }


}