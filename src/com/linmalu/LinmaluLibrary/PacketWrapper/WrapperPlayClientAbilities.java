/**
 * This file is part of PacketWrapper.
 * Copyright (C) 2012-2015 Kristian S. Strangeland
 * Copyright (C) 2015 dmulloy2
 *
 * PacketWrapper is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PacketWrapper is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with PacketWrapper.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.linmalu.LinmaluLibrary.PacketWrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayClientAbilities extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Client.ABILITIES;
    
    public WrapperPlayClientAbilities() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayClientAbilities(PacketContainer packet) {
        super(packet, TYPE);
    }

    public boolean isInvulnurable() {
    	return handle.getBooleans().read(0);
    }

    public void setInvulnurable(boolean value) {
    	handle.getBooleans().write(0, value);
    }

    public boolean isFlying() {
    	return handle.getBooleans().read(1);
    }

    public void setFlying(boolean value) {
    	handle.getBooleans().write(1, value);
    }

    public boolean canFly() {
    	return handle.getBooleans().read(2);
    }

    public void setCanFly(boolean value) {
    	handle.getBooleans().write(2, value);
    }

    public boolean canInstantlyBuild() {
    	return handle.getBooleans().read(3);
    }

    public void setCanInstantlyBuild(boolean value) {
    	handle.getBooleans().write(3, value);
    }

    public float getFlyingSpeed() {
    	return handle.getFloat().read(0);
    }

    public void setFlyingSpeed(float value) {
    	handle.getFloat().write(0, value);
    }

    public float getWalkingSpeed() {
    	return handle.getFloat().read(1);
    }

    public void setWalkingSpeed(float value) {
    	handle.getFloat().write(1, value);
    }
}
