package io.spotnext.groovier

import groovy.transform.CompileStatic
import org.apache.commons.lang3.StringUtils

@CompileStatic
class StringExtension {

    static String trimToNull(String string) {
        return StringUtils.trimToNull(string)
    }

    static String trimToEmpty(String string) {
        return StringUtils.trimToEmpty(string)
    }

    static boolean isBlank(String string) {
        return StringUtils.isBlank(string)
    }

    static boolean isNotBlank(String string) {
        return !isBlank(string)
    }

    static boolean isEmpty(String string) {
        return StringUtils.isEmpty(string)
    }

    static boolean iNotEmpty(String string) {
        return !isEmpty(string)
    }

    static boolean isNull(String string) {
        return string == null
    }
}
