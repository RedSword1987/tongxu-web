package com.tongxuweb.util;


/**
 * utillei.
 *
 * @author RedSword()
 * @date 2013 -11-10 22:21:38
 */
public class StringUtil {
    /**
     * Is empty boolean.
     *
     * @param input the input
     * @return the boolean
     */
    public static boolean isEmpty(String input) {
        if (input == null || "".equals(input.trim()) || "null".equals(input.trim())) {
            return true;
        }
        return false;
    }

    /**
     * Is not empty boolean.
     *
     * @param input the input
     * @return the boolean
     */
    public static boolean isNotEmpty(String input) {
        return !isEmpty(input);
    }


    /**
     * Camel case to under score string.
     *
     * @param name the name
     * @return the string
     */
    public static String camelCase2UnderScore(String name) {
        StringBuilder sb = new StringBuilder();
        name.toCharArray();
        char under = '_';
        for (char chr : name.toCharArray()) {
            if (chr >= 65 && chr <= 90) {
                sb.append(under);
                sb.append((char) (chr + 32));
            } else {
                sb.append(chr);
            }
        }
        return sb.toString();
    }

    /**
     * Under score to camel case string.
     *
     * @param name the name
     * @return the string
     */
    @SuppressWarnings("ModifiedControlVariable")
    public static String underScore2CamelCase(String name) {
        StringBuilder sb = new StringBuilder();
        char under = '_';
        char[] str = name.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] == under) {
                i++;
                sb.append((char) (str[i] - 32));
            } else {
                sb.append(str[i]);
            }
        }
        return sb.toString();
    }

    /**
     * Join string.
     *
     * @param array           the array
     * @param separatorSource the separator source
     * @return the string
     */
    public static String join(String[] array, String separatorSource) {
        String separator = "";
        if (array == null) {
            return "";
        }

        if (separatorSource != null) {
            separator = separatorSource;
        }


        StringBuffer buf = new StringBuffer();
        for (int i = 0; i < array.length; i++) {
            buf.append(array[i]);
            if (i < array.length - 1) {
                buf.append(separator);
            }
        }
        return buf.toString();
    }

}
