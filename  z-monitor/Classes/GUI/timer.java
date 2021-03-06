/* Z-Monitor: A Monitoring Tool for IEEE 802.15.4 Wireless Personal Area Networks

 * Website: http://www.z-monitor.org
 * Contact: dev@z-monitor.org
 *
 * Copyright (c) 2014
 * Owners: Al-Imam University/CISTER Research Unit/Prince Sultan University
 * All rights reserved.
 *
 * License Type: GNU GPL
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/


package Classes.GUI;

public interface timer
{
    //----------------- Set Methods -----------------//
    public void setArrivalTime(String add);
    public void setCaptureTime(long add);
    public void setSinceFirstFrame(long add);
    public void setCaptureTime(double add);
    public void setSinceFirstFrame(double add);
    public void setFrameNo(int add);
    public void setBec(int add,boolean b);
    public void setLenth(int add);
    public void setData(int add);
    public void setAck(int add);
    public void setTimes(double add);
    //-----------------------------------------------//

    //----------------- Get Methods -----------------//
    public String getDayn();
    public String getMonth();
    public String getDay();
    public String getTime();
    public String getYear();
    public long getCaptureTime();
    public long getSinceFirstFrame();
    public double getCaptureTimeDouble();
    public double getSinceFirstFrameDouble();
    public int getFrameNo();
    public int getBec();
    public int getLenth();
    public int getData();
    public int getAck();
    public double getTimes();
    //-----------------------------------------------//	
}