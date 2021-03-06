/*
 * Copyright (c) 2010-2011 Ardesco Solutions - http://www.ardescosolutions.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.lazerycode.ebselen.codegenerators;

public class WebElementListGenerator {

    private String callingCommand = null;
    private String passedValue = null;

    public WebElementListGenerator(String command, String value) {
        callingCommand = command;
        passedValue = value;
    }

    public WebElementListGenerator(String command) {
        callingCommand = command;
    }

    public String size() {
        return callingCommand + "(" + passedValue + ").size()";
    }

    public String toString() {
        return callingCommand + "(" + passedValue + ")";
    }
}
