package com.tongxuweb.util;


import java.util.HashMap;
import java.util.Map;

public class DbSpecialChar {

    private static Map<String, String> referencesMap = new HashMap<String, String>();

    static {
        referencesMap.put("'", "\\'");
        referencesMap.put("\"", "\\\"");
        referencesMap.put("\\", "\\\\");
        referencesMap.put("%", "\\%");
        referencesMap.put("_", "\\_");

        referencesMap.put("\n", "\\\n");
        referencesMap.put("\0", "\\\0");
        referencesMap.put("\b", "\\\b");
        referencesMap.put("\r", "\\\r");
        referencesMap.put("\t", "\\\t");
        referencesMap.put("\f", "\\\f");
    }

    /**
     * Replace for sql my sql string.
     *
     * @param fieldValue the field value
     * @return the string
     */
    public static String replaceForSqlMySql(String fieldValue) {
        if (fieldValue == null) {
            return "";
        }

        StringBuffer sbuffer = new StringBuffer(fieldValue.length());

        for (int i = 0; i < fieldValue.length(); i++) {
            String c = fieldValue.substring(i, i + 1);

            if (referencesMap.get(c) != null) {
                sbuffer.append(referencesMap.get(c));
            } else {
                sbuffer.append(c);
            }
        }
        return sbuffer.toString();

    }

}

