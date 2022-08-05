package com.axisbank.track_micro.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.axisbank.track_micro.entities.Track;

@Repository
public interface TrackRepo extends MongoRepository<Track, Integer>{

}
