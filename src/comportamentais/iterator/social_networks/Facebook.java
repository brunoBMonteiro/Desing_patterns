package comportamentais.iterator.social_networks;

import comportamentais.iterator.iterators.FacebookIterator;
import comportamentais.iterator.iterators.ProfileIterator;
import comportamentais.iterator.profile.Profile;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork {
    private List<Profile> profiles;

    public Facebook(List<Profile> cache) {
        if (cache != null) {
            this.profiles = cache;
        } else {
            this.profiles = new ArrayList<>();
        }
    }

    public Profile requestProfileFromFacebook(String profileEmail) {
        // Aqui seria uma solicitação POST para um dos endpoints da API do Facebook.
        // Em vez disso, emulamos uma conexão de rede longa, que você esperaria
        // na vida real...
        simulateNetworkLatency();
        System.out.println("Facebook: Carregando perfil '" + profileEmail + "' pela rede...");

        // ...e retornar dados de teste.
        return findProfile(profileEmail);
    }

    public List<String> requestProfileFriendsFromFacebook(String profileEmail, String contactType) {
        // Aqui seria uma solicitação POST para um dos endpoints da API do Facebook.
        // Em vez disso, emulamos uma conexão de rede longa, que você esperaria
        // na vida real...
        simulateNetworkLatency();
        System.out.println("Facebook: Carregando '" + contactType + "' lista de '" + profileEmail + "' pela rede...");

        // ... e retornar dados de teste
        Profile profile = findProfile(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    private Profile findProfile(String profileEmail) {
        for (Profile profile : profiles) {
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
        return new FacebookIterator(this, "amigos", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new FacebookIterator(this, "colegas de trabalho", profileEmail);
    }

}
