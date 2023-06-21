package com.alisson;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RegisterTest {
    int int1 = 0;

    @Test
    @DisplayName("Conferindo se todos na lista são do sexo feminino")
    void shouldContains() {
        List<Boolean> checkList = new ArrayList<Boolean>();
        int isFailed;
        Register register = new Register("Pedro-Masculino", "Julia-Feminino", "Gabi-Feminino");

        for (int i = 0; i < register.intermediateList.size(); i++) {
            if (register.intermediateList.get(i).contains("Feminino")) {
                checkList.add(true);
            } else {
                checkList.add(false);
            }
        }

        if (checkList.contains(false)) {
            isFailed = 1;
        } else {
            isFailed = 0;
        }

        assertEquals(int1, isFailed);
    }
}
