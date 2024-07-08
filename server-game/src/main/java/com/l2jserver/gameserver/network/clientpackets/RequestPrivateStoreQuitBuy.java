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
package com.l2jserver.gameserver.network.clientpackets;

import com.l2jserver.gameserver.enums.PrivateStoreType;
import com.l2jserver.gameserver.model.actor.instance.L2PcInstance;

/**
 * @since 2005/03/27 15:29:30
 */
public class RequestPrivateStoreQuitBuy extends L2GameClientPacket {
	private static final String _C__9C_REQUESTPRIVATESTOREQUITBUY = "[C] 9C RequestPrivateStoreQuitBuy";
	
	@Override
	protected void readImpl() {
		// trigger
	}
	
	@Override
	protected void runImpl() {
		L2PcInstance player = getClient().getActiveChar();
		if (player == null) {
			return;
		}
		
		player.setPrivateStoreType(PrivateStoreType.NONE);
		player.standUp();
		player.broadcastUserInfo();
	}
	
	@Override
	public String getType() {
		return _C__9C_REQUESTPRIVATESTOREQUITBUY;
	}
	
	@Override
	protected boolean triggersOnActionRequest() {
		return false;
	}
}
