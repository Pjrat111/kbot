/*	
	Copyright 2012 Jan Ove Saltvedt
	
	This file is part of KBot.

    KBot is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    KBot is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with KBot.  If not, see <http://www.gnu.org/licenses/>.
	
*/

/*
 * Copyright � 2010 Jan Ove Saltvedt.
 * All rights reserved.
 */

package com.kbot2.scriptable.methods.data;

import com.kbot2.bot.BotEnvironment;

/**
 * Created by IntelliJ IDEA.
 * User: Jan Ove / Kosaki
 * Date: 20.apr.2009
 * Time: 20:29:30
 */
public class Settings extends Data {

    // Constants
    public static final int SETTING_TOGGLE_ACCEPT_AID = 427;
	public static final int SETTING_TOGGLE_RUN = 173;
	public static final int SETTING_MOUSE_BUTTONS = 170;
	public static final int SETTING_CHAT_EFFECTS = 171;
	public static final int SETTING_SPLIT_PRIVATE_CHAT = 287;
	public static final int SETTING_ADJUST_SCREEN_BRIGHTNESS = 166;
	public static final int SETTING_ADJUST_MUSIC_VOLUME = 168;
	public static final int SETTING_ADJUST_SOUND_EFFECT_VOLUME = 169;
	public static final int SETTING_ADJUST_AREA_SOUND_EFFECT_VOLUME = 872;
	public static final int SETTING_COMBAT_STYLE = 43;
	public static final int SETTING_AUTO_RETALIATE = 172;
	public static final int SETTING_SWAP_QUEST_DIARY = 1002;
	public static final int SETTING_PRAYER_THICK_SKIN = 83;
	public static final int SETTING_TOGGLE_LOOP_MUSIC = 19;
	public static final int SETTING_BANK_TOGGLE_REARRANGE_MODE = 304;
	public static final int SETTING_BANK_TOGGLE_WITHDRAW_MODE = 115;
	public static final int SETTING_TYPE_SHOP = 118;
	public static final int SETTING_SPECIAL_ATTACK_ENABLED = 301;

    public Settings(BotEnvironment botEnv) {
        super(botEnv);
    }

    /**
     * Gets a setting
     * @param settingIndex
     * @return -1 if index don't exist, or if the setting is -1 :/
     * Use settingExist to be sure.
     */
    public int getSetting(int settingIndex){
        return botEnv.proBotEnvironment.settings.getSetting(settingIndex);
    }

    public boolean settingExists(int settingIndex){
        return botEnv.proBotEnvironment.settings.settingExist(settingIndex);
    }

}

