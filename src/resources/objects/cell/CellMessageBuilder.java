/*******************************************************************************
 * Copyright (c) 2013 <Project SWG>
 * 
 * This File is part of NGECore2.
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * 
 * Using NGEngine to work with NGECore2 is making a combined work based on NGEngine. 
 * Therefore all terms and conditions of the GNU Lesser General Public License cover the combination.
 ******************************************************************************/
package resources.objects.cell;

import java.nio.ByteOrder;

import org.apache.mina.core.buffer.IoBuffer;

import resources.objects.ObjectMessageBuilder;

public class CellMessageBuilder extends ObjectMessageBuilder {
	
	public CellMessageBuilder(CellObject cellObject) {
		setObject(cellObject);
	}
	
	public IoBuffer buildBaseline3() {

		CellObject cell = (CellObject) object;
		IoBuffer buffer = bufferPool.allocate(27, false).order(ByteOrder.LITTLE_ENDIAN);
		
		buffer.putShort((short) 6);
		buffer.putFloat(0);
		buffer.putShort((short) 0);
		
		buffer.putInt(0);
		buffer.putShort((short) 0);
		
		buffer.putInt(0);
		buffer.putInt(0);
		buffer.put((byte) 1);
		buffer.putInt(cell.getCellNumber());

		int size = buffer.position();

		buffer.flip();
		buffer = createBaseline("SCLT", (byte) 3, buffer, size);

		return buffer;

	}
	
	public IoBuffer buildBaseline6() {

		IoBuffer buffer = bufferPool.allocate(30, false).order(ByteOrder.LITTLE_ENDIAN);
		
		buffer.putShort((short) 4);
		buffer.putInt(0x43);
		buffer.putInt(0);
		buffer.putInt(0);
		buffer.putInt(0);
		buffer.putInt(0);
		buffer.putInt(0);
		buffer.putInt(0);

		int size = buffer.position();

		buffer.flip();
		buffer = createBaseline("SCLT", (byte) 6, buffer, size);

		return buffer;

	}



	@Override
	public void sendListDelta(byte viewType, short updateType, IoBuffer buffer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sendBaselines() {
		// TODO Auto-generated method stub
		
	}
}
