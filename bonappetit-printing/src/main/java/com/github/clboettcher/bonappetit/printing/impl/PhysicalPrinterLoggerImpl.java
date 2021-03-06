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
package com.github.clboettcher.bonappetit.printing.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.print.PrintException;

/**
 * Implementation of {@link PhysicalPrinter} to use for development.
 * <p>
 * The implementation just logs what would be printed.
 */
@Component
@Profile("mockPrinter")
public class PhysicalPrinterLoggerImpl implements PhysicalPrinter {

    private static final Logger LOGGER = LoggerFactory.getLogger(PhysicalPrinterLoggerImpl.class);

    public PhysicalPrinterLoggerImpl() {
        LOGGER.info(String.format("Using %s as printer implementation.", this.getClass().getSimpleName()));
    }

    @Override
    public void print(String output) throws PrintException {
        LOGGER.info(String.format("Printing output:\n%s", output));
    }
}
