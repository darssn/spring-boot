package dev.mission.exec;

import java.util.List;

import org.springframework.stereotype.Controller;

import dev.mission.entite.Mission;
import dev.mission.repository.MissionRepository;


public class ListerMission implements Runnable {
	private MissionRepository missionRepository;

	public ListerMission(MissionRepository missionRepository) {
		super();
		this.missionRepository = missionRepository;
	}

	@Override
	public void run() {
		List<Mission> list = this.missionRepository.findAll();
		
		for(Mission m : list){
			
			System.out.println(m.getId()+" - "+m.getLibelle() );
		}
	}
}