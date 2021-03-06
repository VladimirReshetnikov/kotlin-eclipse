/*******************************************************************************
 * Copyright 2000-2014 JetBrains s.r.o.
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
 *
 *******************************************************************************/
package org.jetbrains.kotlin.ui.tests.editors.markers;

import org.junit.Test;

public class KotlinParsingMarkersTest extends KotlinParsingMarkersTestCase {
	@Override
    protected String getTestDataRelativePath() {
        return "markers/parsing";
    }
    
    @Test
    public void missingClosingBraceErrorTest() {
        doAutoTest();
    }
    
    @Test
    public void classDefinitionTypoErrorTest() {
        doAutoTest();
    }
    
    @Test
    public void missingFunctionBodyErrorTest() {
        doAutoTest();
    }
    
    @Test
    public void excessBraceTypingErrorTest() {
        doAutoTest();
    }
}
