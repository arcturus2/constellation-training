/*
 * Copyright 2010-2019 Australian Signals Directorate
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package au.gov.asd.tac.constellation.training.exercises.chapter3;

import au.gov.asd.tac.constellation.visual.icons.ConstellationIcon;
import au.gov.asd.tac.constellation.visual.icons.ConstellationIconProvider;
import java.util.Collections;
import java.util.List;
import org.openide.util.lookup.ServiceProvider;

/**
 * Pandemic Icon Provider.
 *
 * TODO: register this icon provider as an ConstellationIconProvider class.
 */
@ServiceProvider(service = ConstellationIconProvider.class)
public class PandemicIconProvider implements ConstellationIconProvider {

    // TODO: create the 'Biohazard' icon.
    @Override
    public List<ConstellationIcon> getIcons() {
        // TODO: register the 'Biohazard' icon to this icon provider.
        return Collections.emptyList();
    }
}