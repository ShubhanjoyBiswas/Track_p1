package com.axisbank.track_micro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.axisbank.track_micro.entities.Track;
import com.axisbank.track_micro.service.TrackService;

@CrossOrigin
@RestController
@RequestMapping("/track")
public class TrackController {
	@Autowired
	TrackService ts;
@GetMapping("/getone")
public Track getOneTrack(){
	return ts.gOT();
}
@PostMapping("/addone")
public void addOne(@RequestBody Track t) {
	ts.aOT(t);
}
@PostMapping("/modifyone")
public void modifyOne(@RequestBody Integer i) {
	ts.mO(i);
}
@DeleteMapping("/delete/trackarray")
public void deleteTrackArray() {
	ts.dTA();
}
}
