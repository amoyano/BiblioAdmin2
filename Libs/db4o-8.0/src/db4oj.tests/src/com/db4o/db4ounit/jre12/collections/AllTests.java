/* This file is part of the db4o object database http://www.db4o.com

Copyright (C) 2004 - 2010  Versant Corporation http://www.versant.com

db4o is free software; you can redistribute it and/or modify it under
the terms of version 3 of the GNU General Public License as published
by the Free Software Foundation.

db4o is distributed in the hope that it will be useful, but WITHOUT ANY
WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
for more details.

You should have received a copy of the GNU General Public License along
with this program.  If not, see http://www.gnu.org/licenses/. */
package com.db4o.db4ounit.jre12.collections;

import db4ounit.extensions.*;

/**
 */
@decaf.Remove(decaf.Platform.JDK11)
public class AllTests extends Db4oTestSuite {

    public static void main(String[] arguments) {
		new AllTests().runAll();
    }

    protected Class[] testCases() {
		return new Class[] {
			ArrayListElementQueriesTestCase.class,
			ArrayListInHashMapTestCase.class,
			ArrayListCandidatesTestCase.class,
			BigSetTestCase.class,
			ByteArrayAsMapValueTestCase.class,
			CascadeDeleteCollectionTestCase.class,
			CascadeDeleteSubClassTestCase.class,
			CascadeToHashMapTestCase.class,
        	CollectionUuidTest.class,
        	DeleteFromMapTestCase.class,
        	HashMapActivationTestCase.class,
        	HashMapUpdateFileSizeTestCase.class,
        	Iterator4JdkIteratorTestCase.class,
        	JdkCollectionIterator4TestCase.class,
        	KeepCollectionContentTestCase.class,
        	NestedListTestCase.class,
        	PersistentListTestCase.class,
        	SetCollectionOnUpdateTestCase.class, 
        	TreeSetCustomComparableTestCase.class,
        	TreeSetTestSuite.class,
        	com.db4o.db4ounit.jre12.collections.map.AllTests.class, 
		};
    }
}
