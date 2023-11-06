package org.yubatool;



import cn.hutool.core.lang.Validator;
import cn.hutool.core.util.NumberUtil;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParamVail extends Validator {

    public static boolean vailString(String ... args) {
        for (String s : args) {
            if (Validator.isNotEmpty(s)) {
                if (!Validator.isLetter(s)) {
                    return false;
                }
            } else {
                return false;
            }
        }
        return true;
    }

}
