package comportamentais.iterator.social_networks;

import comportamentais.iterator.iterators.LinkedInIterator;
import comportamentais.iterator.iterators.ProfileIterator;
import comportamentais.iterator.profile.Profile;

import java.util.ArrayList;
import java.util.List;

public class LinkedIn implements SocialNetwork {
    private List<Profile> contacts;

    public LinkedIn(List<Profile> cache) {
        if (cache != null) {
            this.contacts = cache;
        } else {
            this.contacts = new ArrayList<>();
        }
    }

    public Profile requestContactInfoFromLinkedInAPI(String profileEmail) {
        // Aqui estaria uma solicitação POST para um dos endpoints da API do LinkedIn.
        // Em vez disso, emulamos uma conexão de rede longa, que você esperaria
        // na vida real...
        simulateNetworkLatency();
        System.out.println("LinkedIn: Carregando perfil '" + profileEmail + "' pela rede...");

        // ...e retornar dados de teste.
        return findContact(profileEmail);
    }

    public List<String> requestRelatedContactsFromLinkedInAPI(String profileEmail, String contactType) {
        // Aqui estaria uma solicitação POST para um dos endpoints da API do LinkedIn.
        // Em vez disso, emulamos uma conexão de rede longa, que você esperaria
        // na vida real.
        simulateNetworkLatency();
        System.out.println("LinkedIn: Carregando '" + contactType + "' lista de '" + profileEmail + "' pela rede...");

        // ...e retornar os dados de teste.
        Profile profile = findContact(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    private Profile findContact(String profileEmail) {
        for (Profile profile : contacts) {
            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new LinkedInIterator(this, "amigos", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new LinkedInIterator(this, "colegas de trabalho", profileEmail);
    }
}
