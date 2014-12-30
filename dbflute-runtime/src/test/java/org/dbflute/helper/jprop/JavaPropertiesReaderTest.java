/*
 * Copyright 2014-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, 
 * either express or implied. See the License for the specific language
 * governing permissions and limitations under the License.
 */
package org.dbflute.helper.jprop;

import org.dbflute.unit.RuntimeTestCase;

/**
 * @author jflute
 */
public class JavaPropertiesReaderTest extends RuntimeTestCase {

    public void test_loadConvert() {
        // ## Arrange ##
        JavaPropertiesReader reader = new JavaPropertiesReader(null, null);
        String text = "\u938c\u5009\u306e\u3044\u306c";

        // ## Act ##
        String actual = reader.loadConvert(text);

        // ## Assert ##
        log(actual);
        assertEquals("鎌倉のいぬ", actual);
    }
}
