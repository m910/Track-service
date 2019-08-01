package com.stackroute.service;

import com.stackroute.domain.Track;
import com.stackroute.repository.TrackRepository;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class TrackServiceImpl implements TrackService {

    private TrackRepository trackRepository;

    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }


    @Override
    public Track saveTrack(Track track) {

        Track saveTrack= trackRepository.save(track);
        return saveTrack;
    }

    @Override
    public Track getTrackById(int id) {
        Track retrivedTrack = trackRepository.findById(id).get();
        return retrivedTrack;
    }

//    @Override
//    public List<Track> getAllTracks(Track track) {
//       List<Track> retrivedList = trackRepository.findAll();
//        return retrivedList;
//    }

//    @Override
//    public Track deleteTrackById(int id) {
//        Track deleteTrack= trackRepository.deleteById(id).;
//        return deleteTrack;
//    }
//
//    @Override
//    public Track updateTrackById(int id) {
//        Track updateTrack = trackRepository.(id);
//        return updateTrack;
//    }
}
