package model;

import java.util.ArrayList;

public class regvoteService {
	regvoteDAO dao;
	
	public regvoteService() {}

	public regvoteService(regvoteDAO dao) {
		super();
		this.dao = dao;
	}
	
	public void insert(regvoteDTO dto) {
		dao.insert(dto);
	}
	public ArrayList<voterateDTO> voterate(){
		return dao.voterate();
	}
	
	public ArrayList<votecheckDTO> votecheck(){
		return dao.votecheck();
	}
	
	public ArrayList<candidateDTO> candidate(){
		return dao.candidate();
	}
}
