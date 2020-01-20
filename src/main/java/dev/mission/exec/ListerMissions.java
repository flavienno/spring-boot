package dev.mission.exec;

import java.util.List;

import org.springframework.stereotype.Controller;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;


public class ListerMissions implements Runnable {

	private MissionRepository missionRepository;

	public ListerMissions(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run() {
		// creation de la liste des missions
		List<Mission> missions = this.missionRepository.findAll();
		
		// on affiche ttes les listes
		for (Mission mission : missions) {
			System.out.println(mission.getLibelle() + " " + mission.getId());

		}
	}
}
