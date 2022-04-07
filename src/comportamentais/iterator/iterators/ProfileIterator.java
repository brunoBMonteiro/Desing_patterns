package comportamentais.iterator.iterators;

import comportamentais.iterator.profile.Profile;

public interface ProfileIterator {
    boolean hasNext();

    Profile getNext();

    void reset();
}
