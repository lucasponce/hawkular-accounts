/*
 * Copyright 2015 Red Hat, Inc. and/or its affiliates
 * and other contributors as indicated by the @author tags.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.hawkular.accounts.api.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * Represents a Role in the system. Roles can be, for instance, "Super User", "Monitor", "Auditor" and so on.
 *
 * @author Juraci Paixão Kröhling
 */
@Entity
public class Role extends BaseEntity {

    @Column(unique = true)
    private String name;
    private String description;

    protected Role() { // JPA happy
    }

    public Role(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Role(String id, String name, String description) {
        super(id);
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
