package io.spotnext.groovier

import groovy.transform.CompileStatic
import org.apache.commons.lang3.StringUtils

@CompileStatic
class StringExtension {

	/**
	 * If the given string is NOT blank/empty/null, it is returned unalterted. Otherwise the given default value is returned.
	 * @param string to check
	 * @param defaultValue in case the input string is blank
	 * @return the input string or the default string
	 */
	static String trimToDefault(String string, String defaultValue) {
		def ret = StringUtils.trimToNull(string)
		if (!ret) {
			ret = defaultValue
		}

		return ret
	}

	/**
	 * If the given input string is blank/empty/null then null is returned, otherwise the input string is returned unaltered.
	 */
	static String trimToNull(String string) {
		return StringUtils.trimToNull(string)
	}

	/**
	 * If the given input string is empty/null then null is returned, otherwise the input string is returned unaltered.
	 */
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
