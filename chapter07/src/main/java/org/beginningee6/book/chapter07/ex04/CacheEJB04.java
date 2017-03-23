package org.beginningee6.book.chapter07.ex04;

import javax.ejb.AccessTimeout;
import javax.ejb.ConcurrencyManagement;
import javax.ejb.ConcurrencyManagementType;
import javax.ejb.Singleton;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/**
 * @author Antonio Goncalves
 *         APress Book - Beginning Java EE 6 with Glassfish
 *         http://www.apress.com/
 *         http://www.antoniogoncalves.org
 *         --
 */
@Singleton
@ConcurrencyManagement(ConcurrencyManagementType.BEAN)
public class CacheEJB04 {

    // ======================================
    // =             Attributes             =
    // ======================================
    private Map<Long, Object> cache = new HashMap<Long, Object>();

    // ======================================
    // =           Public Methods           =
    // ======================================

    public synchronized void addToCache(Long id, Object object) {
        if (!cache.containsKey(id))
            cache.put(id, object);
    }

    public synchronized void removeFromCache(Long id) {
        if (cache.containsKey(id))
            cache.remove(id);
    }

    public Object getFromCache(Long id) {
        if (cache.containsKey(id))
            return cache.get(id);
        else
            return null;
    }

    public Integer getNumberOfItems() {
        if (cache == null || cache.isEmpty())
            return 0;
        return cache.size();
    }
}