package org.beginningee6.book.chapter03.ex14;

import org.beginningee6.book.chapter03.AbstractPersistentTest;
import org.junit.Test;

import static org.junit.Assert.assertNotNull;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 6 with Glassfish
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 *         Test class that creates a Track14
 */
public class Track14Test extends AbstractPersistentTest {

    // ======================================
    // =              Unit tests            =
    // ======================================
    @Test
    public void shouldCreateATrack() throws Exception {

        Track14 track = new Track14("Sgt Pepper Lonely Heart Club Ban", 4.53f, "Listen to the trumpet carefully, it's George Harrison playing");
        tx.begin();
        em.persist(track);
        tx.commit();
        assertNotNull("ID should not be null", track.getId());
    }
}