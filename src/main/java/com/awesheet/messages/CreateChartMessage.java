/*
 * AweSheet - Simple Open-Source Spreadsheet Editor
 * Copyright (c) 2015 - 2016, Orfeas - Ioannis Zafeiris, Nikolaos Fylakis
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.awesheet.messages;

public abstract class CreateChartMessage extends UIMessage {
    protected String title;
    protected String xaxis;
    protected String yaxis;

    protected CreateChartMessage(int type) {
        super(type);
    }

    public String getTitle() {
        return title;
    }

    public String getXaxis() {
        return xaxis;
    }

    public String getYaxis() {
        return yaxis;
    }
}
