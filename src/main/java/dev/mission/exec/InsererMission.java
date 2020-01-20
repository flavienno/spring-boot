package dev.mission.exec;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.stereotype.Controller;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;


public class InsererMission implements Runnable {

	private MissionRepository missionRepository;

	public InsererMission(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run() {
		Mission mission = new Mission();
		mission.setLibelle("Mission 1");
		mission.setTauxJournalier(new BigDecimal("100.90"));
		mission.setDateDebut(LocalDate.of(2019, 1, 1));
		mission.setDateFin(LocalDate.of(2019, 3, 4));

		Mission mission2 = new Mission();
		mission2.setLibelle("Mission 2");
		mission2.setTauxJournalier(new BigDecimal("200.90"));
		mission2.setDateDebut(LocalDate.of(2019, 2, 2));
		mission2.setDateFin(LocalDate.of(2019, 5, 7));

		this.missionRepository.save(mission2);

	}

}
