
import hashing.HashSetLinearProbing;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;
public class HashSetLinearProbingTest {


        @Test
        public void addOneElementTest() {
            HashSetLinearProbing set = new HashSetLinearProbing(13);
            String s = "Alice";
            set.add(s);
            assertTrue(set.contains(s));
        }

        @Test
        public void addExistingElementTest() {
            HashSetLinearProbing set = new HashSetLinearProbing(13);
            String bob = "Bob";
            set.add(bob);
            assertFalse(set.add("Bob"));

        }

        @Test
        public void collisionsTest() {
            HashSetLinearProbing set = new HashSetLinearProbing(13);
            String p = "P";
            set.add(p);
            String c = "C";
            set.add(c);

            assertEquals(set.hashValue(c), set.hashValue(p));

            assertEquals(p, set.buckets[2]);
            assertEquals(c, set.buckets[3]);
        }

        @Test
        public void removeTest() {
            HashSetLinearProbing set = new HashSetLinearProbing(13);
            String s1 = "Frederik";
            String s2 = "Morten";

            set.add(s1);
            set.add(s2);

            //Tester på String s2
            assertTrue(set.contains(s2));

            set.remove(s2);

            assertFalse(set.contains(s2));
        }

        @Test
        public void addOnDeletedCell() {
            HashSetLinearProbing set = new HashSetLinearProbing(13);

            String s1 = "Frederik";
            String s2 = "Morten";
            String s3 = "Rasmus";

            set.add(s1);
            set.add(s2);
            set.add(s3);

            assertTrue(set.contains(s1));

            set.remove(s1);

            assertTrue(!set.contains(s1));

            set.add(s1);

            assertTrue(set.contains(s1));
        }
    }
