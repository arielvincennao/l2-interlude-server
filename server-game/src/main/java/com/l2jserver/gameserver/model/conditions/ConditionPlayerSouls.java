/*
 * Copyright © 2004-2024 L2J Server
 * 
 * This file is part of L2J Server.
 * 
 * L2J Server is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * L2J Server is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package com.l2jserver.gameserver.model.conditions;

import com.l2jserver.gameserver.model.actor.L2Character;
import com.l2jserver.gameserver.model.items.L2Item;
import com.l2jserver.gameserver.model.skills.Skill;

/**
 * Souls condition.
 */
public class ConditionPlayerSouls extends Condition {
	private final int _souls;
	
	public ConditionPlayerSouls(int souls) {
		_souls = souls;
	}
	
	@Override
	public boolean testImpl(L2Character effector, L2Character effected, Skill skill, L2Item item) {
		return (effector.getActingPlayer() != null) && (effector.getActingPlayer().getChargedSouls() >= _souls);
	}
}
