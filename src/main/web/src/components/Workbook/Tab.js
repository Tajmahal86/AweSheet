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

import React, { Component, PropTypes } from 'react'

export default class Tab extends Component
{
    render()
    {
        let className = 'tab';

        if (this.props.active)
            className += ' active';

        let closeButton = null;

        if (this.props.canDelete && !this.props.active)
            closeButton = <span ref="close" className="close" onClick={(e) => this.onDelete(e)}>x</span>;

        return (
            <div className={className} onClick={(e) => this.onClick(e)}>
                <span className="text">{this.props.text}</span>
                {closeButton}
            </div>
        );
    }

    onClick(e)
    {
        e.preventDefault();

        if (e.target == this.refs.close)
            return;

        if (this.props.active || !this.props.onClick)
            return;

        this.props.onClick(this.props.data);
    }

    onDelete(e)
    {
        e.preventDefault();

        if (this.props.active || !this.props.onDelete || !this.props.canDelete)
            return;

        this.props.onDelete(this.props.data);
    }
}
