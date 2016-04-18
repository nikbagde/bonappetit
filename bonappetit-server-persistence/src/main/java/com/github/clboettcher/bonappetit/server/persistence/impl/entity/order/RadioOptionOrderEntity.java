/*
 * Copyright (c) 2016 Claudius Boettcher (pos.bonappetit@gmail.com)
 *
 * This file is part of BonAppetit. BonAppetit is an Android based
 * Point-of-Sale client-server application for small restaurants.
 *
 * BonAppetit is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * BonAppetit is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with BonAppetit.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.github.clboettcher.bonappetit.server.persistence.impl.entity.order;

import com.github.clboettcher.bonappetit.server.persistence.impl.entity.menu.RadioItemEntity;
import com.github.clboettcher.bonappetit.server.persistence.impl.entity.menu.RadioOptionEntity;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 * An order for a {@link RadioOptionEntity}.
 */
@Entity
public class RadioOptionOrderEntity extends AbstractOptionOrderEntity {

    @OneToOne(optional = false)
    @JoinColumn(name = "SELECTED_RADIO_ITEM_ID", nullable = false)
    private RadioItemEntity selectedItem;

    /**
     * @return The radio item that was selected.
     */
    public RadioItemEntity getSelectedItem() {
        return selectedItem;
    }

    public void setSelectedItem(RadioItemEntity selectedItem) {
        this.selectedItem = selectedItem;
    }
}