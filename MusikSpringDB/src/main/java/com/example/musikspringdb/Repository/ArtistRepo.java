package com.example.musikspringdb.Repository;

import com.example.musikspringdb.Model.Artist;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ArtistRepo {
    @Autowired
    JdbcTemplate template;

    public List<Artist> fetchAll(){
        String sql = "SELECT * FROM Artist";
        RowMapper<Artist> rowMapper = new BeanPropertyRowMapper<>(Artist.class);
        return template.query(sql, rowMapper);
    }

    public void addArtist(Artist a){
        String sql = "INSERT INTO Artist (Artist_ID, ArtistName, Country, Gender, age) VALUES (?, ?, ?, ?, ?)";
        template.update(sql, a.getArtist_ID(), a.getArtistName(), a.getAge(), a.getGender(), a.getCountry());
    }

    public Artist findArtistById(int id){
        String sql = "SELECT * FROM artist WHERE Artist_ID = ?";
        RowMapper<Artist> rowMapper = new BeanPropertyRowMapper<>(Artist.class);
        Artist p = template.queryForObject(sql, rowMapper, id);
        return p;
    }

    public Boolean deleteArtist(int id){
        String sql = "DELETE FROM artist WHERE Artist_ID = ?";
        return template.update(sql, id) > 0;
    }

    public void updateArtist(Artist a){
        String sql = "UPDATE artist SET ArtistName = ?, Country = ?, Gender = ?, age = ? WHERE Artist_ID = ?";
        template.update(sql, a.getArtist_ID(), a.getArtistName(), a.getAge(), a.getGender(), a.getCountry());
    }
}