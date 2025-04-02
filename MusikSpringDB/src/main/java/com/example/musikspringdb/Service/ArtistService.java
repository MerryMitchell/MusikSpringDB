package com.example.musikspringdb.Service;

import com.example.musikspringdb.Model.Artist;
import com.example.musikspringdb.Repository.ArtistRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistService {
    @Autowired
    ArtistRepo artistRepo;

    public List<Artist> fetchAll(){
        return artistRepo.fetchAll();
    }

    public void addArtist(Artist a){
        artistRepo.addArtist(a);
    }

    public Artist findArtistById(int id){
        return artistRepo.findArtistById(id);
    }

    public Boolean deleteArtist(int id){
        return artistRepo.deleteArtist(id);
    }

    public void updateArtist(Artist a){
        artistRepo.updateArtist(a);
    }
}