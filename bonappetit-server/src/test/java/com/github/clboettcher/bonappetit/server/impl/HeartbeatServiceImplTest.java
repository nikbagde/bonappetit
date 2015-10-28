/*
* Copyright (c) 2015 Claudius Boettcher (claudius.boettcher@gmail.com)
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
package com.github.clboettcher.bonappetit.server.impl;


import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Tests for {@link HeartbeatServiceImpl}.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = HeartbeatServiceImplTest.Context.class)
public class HeartbeatServiceImplTest {

    @Autowired
    private HeartbeatServiceImpl service;

    /**
     * Asserts that the heartbeat service answers pings with pongs.
     */
    @Test
    public void testPingPong() throws Exception {
        Assert.assertThat(service.ping(), Matchers.is("pong"));
    }

    @Configuration
    static class Context {
        @Bean
        public HeartbeatServiceImpl heartbeatServiceImpl() {
            return new HeartbeatServiceImpl();
        }
    }
}
