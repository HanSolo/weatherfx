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

package eu.hansolo.fx.weatherfx.fonts;

import javafx.scene.text.Font;


/**
 * User: hansolo
 * Date: 01.10.16
 * Time: 04:47
 */
public class Fonts {
    private static final String ROBOTO_THIN_NAME;
    private static final String ROBOTO_LIGHT_NAME;
    private static final String ROBOTO_REGULAR_NAME;
    private static final String ROBOTO_MEDIUM_NAME;
    private static final String ROBOTO_BOLD_NAME;
    private static final String ROBOTO_LIGHT_CONDENSED_NAME;
    private static final String ROBOTO_REGULAR_CONDENSED_NAME;
    private static final String ROBOTO_BOLD_CONDENSED_NAME;

    private static String robotoThinName;
    private static String robotoLightName;
    private static String robotoRegularName;
    private static String robotoMediumName;
    private static String robotoBoldName;
    private static String robotoLightCondensedName;
    private static String robotoRegularCondensedName;
    private static String robotoBoldCondensedName;


    static {
        try {
            robotoThinName             = Font.loadFont(Fonts.class.getResourceAsStream("/eu/hansolo/fx/weatherfx/fonts/Roboto-Thin.ttf"), 10).getName();
            robotoLightName            = Font.loadFont(Fonts.class.getResourceAsStream("/eu/hansolo/fx/weatherfx/fonts/Roboto-Light.ttf"), 10).getName();
            robotoRegularName          = Font.loadFont(Fonts.class.getResourceAsStream("/eu/hansolo/fx/weatherfx/fonts/Roboto-Regular.ttf"), 10).getName();
            robotoMediumName           = Font.loadFont(Fonts.class.getResourceAsStream("/eu/hansolo/fx/weatherfx/fonts/Roboto-Medium.ttf"), 10).getName();
            robotoBoldName             = Font.loadFont(Fonts.class.getResourceAsStream("/eu/hansolo/fx/weatherfx/fonts/Roboto-Bold.ttf"), 10).getName();
            robotoLightCondensedName   = Font.loadFont(Fonts.class.getResourceAsStream("/eu/hansolo/fx/weatherfx/fonts/RobotoCondensed-Light.ttf"), 10).getName();
            robotoRegularCondensedName = Font.loadFont(Fonts.class.getResourceAsStream("/eu/hansolo/fx/weatherfx/fonts/RobotoCondensed-Regular.ttf"), 10).getName();
            robotoBoldCondensedName    = Font.loadFont(Fonts.class.getResourceAsStream("/eu/hansolo/fx/weatherfx/fonts/RobotoCondensed-Bold.ttf"), 10).getName();
        } catch (Exception exception) { }
        ROBOTO_THIN_NAME              = robotoThinName;
        ROBOTO_LIGHT_NAME             = robotoLightName;
        ROBOTO_REGULAR_NAME           = robotoRegularName;
        ROBOTO_MEDIUM_NAME            = robotoMediumName;
        ROBOTO_BOLD_NAME              = robotoBoldName;
        ROBOTO_LIGHT_CONDENSED_NAME   = robotoLightCondensedName;
        ROBOTO_REGULAR_CONDENSED_NAME = robotoRegularCondensedName;
        ROBOTO_BOLD_CONDENSED_NAME    = robotoBoldCondensedName;
    }


    // ******************** Methods *******************************************
    public static Font robotoThin(final double SIZE) { return new Font(ROBOTO_THIN_NAME, SIZE); }
    public static Font robotoLight(final double SIZE) { return new Font(ROBOTO_LIGHT_NAME, SIZE); }
    public static Font robotoRegular(final double SIZE) { return new Font(ROBOTO_REGULAR_NAME, SIZE); }
    public static Font robotoMedium(final double SIZE) { return new Font(ROBOTO_MEDIUM_NAME, SIZE); }
    public static Font robotoBold(final double SIZE) { return new Font(ROBOTO_BOLD_NAME, SIZE); }
    public static Font robotoCondensedLight(final double SIZE) { return new Font(ROBOTO_LIGHT_CONDENSED_NAME, SIZE); }
    public static Font robotoCondensedRegular(final double SIZE) { return new Font(ROBOTO_REGULAR_CONDENSED_NAME, SIZE); }
    public static Font robotoCondensedBold(final double SIZE) { return new Font(ROBOTO_BOLD_CONDENSED_NAME, SIZE); }
}
