package com.axisbank.track_micro.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axisbank.track_micro.entities.Track;
import com.axisbank.track_micro.repo.TrackRepo;

@Service
public class TrackService {
@Autowired
TrackRepo tr;
public Track gOT() {
	return tr.findById(1).get();
}
public void aOT(Track t) {
	tr.save(t);
}
public void mO(Integer i) {
	Track t=tr.findById(1).get();
	ArrayList<Integer> bn=t.getArr();
	bn.add(i);
	t.setArr(bn);
	tr.deleteById(1);
	tr.save(t);
}
public void dTA() {
	Track t=tr.findById(1).get();
	ArrayList<Integer> bn=new ArrayList<>();
	t.setArr(bn);
	tr.deleteById(t.getId());
	tr.save(t);
}
}
