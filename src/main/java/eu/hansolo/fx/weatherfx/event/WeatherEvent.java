/*
 * Copyright (c) 2016 by Gerrit Grunwald
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

package eu.hansolo.fx.weatherfx.event;

import eu.hansolo.fx.weatherfx.Location;

import java.util.EventObject;


/**
 * Created by hansolo on 04.10.16.
 */
public class WeatherEvent extends EventObject {
    private final Location LOCATION;


    // ******************** Constructors **************************************
    public WeatherEvent(final Object SRC) {
        super(SRC);
        LOCATION = (Location) SRC;
    }


    // ******************** Methods *******************************************
    public Location getLocation() { return LOCATION; }
}
