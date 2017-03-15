//package ru.smurtazin.springmongodb.springdatabook;

/**
 * Created by a1 on 14.03.17.
 */
/*
 * Copyright 2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ru.smurtazin.springmongodb.main;

import com.oreilly.springdata.mongodb.core.AbstractDocument;
import com.oreilly.springdata.mongodb.core.EmailAddress;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.util.Assert;

import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * A customer.
 *
 * @author Oliver Gierke
 */
@Document
public class Customer extends AbstractDocument {

    private String firstname, lastname;
    public Date birthday;
    public String password;

    @Field("email")
    @Indexed(unique = true)
    private EmailAddress emailAddress;

    /**
     * Creates a new {@link Customer} from the given firstname and lastname.
     *
     * @param firstname must not be {@literal null} or empty.
     * @param lastname must not be {@literal null} or empty.
     */
    public Customer(String firstname, String lastname) {

        Assert.hasText(firstname);
        Assert.hasText(lastname);

        this.firstname = firstname;
        this.lastname = lastname;
    }

    protected Customer() {

    }

    /**
     * Returns the firstname of the {@link Customer}.
     *
     * @return
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * Returns the lastname of the {@link Customer}.
     *
     * @return
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * Sets the lastname of the {@link Customer}.
     *
     * @param lastname
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * Returns the {@link EmailAddress} of the {@link Customer}.
     *
     * @return
     */
    public EmailAddress getEmailAddress() {
        return emailAddress;
    }

    /**
     * Sets the {@link Customer}'s {@link EmailAddress}.
     *
     * @param emailAddress must not be {@literal null}.
     */
    public void setEmailAddress(EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
    }

    // ================== Mein ==========
    /**
     * Returns the birthday of the {@link Customer}.
     *
     * @return
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * Sets the birthday of the {@link Customer}.
     *
     * @param birthday
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * Returns the password of the {@link Customer}.
     *
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password of the {@link Customer}.
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
