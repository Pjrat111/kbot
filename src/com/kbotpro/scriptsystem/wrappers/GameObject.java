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



package com.kbotpro.scriptsystem.wrappers;

import com.kbotpro.bot.BotEnvironment;

/**
 * In game game object wrapper.
 * Character, Player, NPC and PhysicalObjects derive from this
 *
 */
public class GameObject extends Renderable {
    private com.kbotpro.hooks.GameObject rGameObject;

    protected GameObject(BotEnvironment botEnv, com.kbotpro.hooks.GameObject rGameObject ) {
        super(botEnv, rGameObject);
        this.rGameObject = rGameObject;
    }

    @Override
    public int getYOffset() {
        return rGameObject.getPosZ();
    }
}
