package election.web.model;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import election.web.exception.VotingException;

public class Candidates {
	private static Candidates candidates = null;
	Map <String, Integer> ballotVotes = null;

	private Candidates() {
		ballotVotes = new HashMap<String, Integer>();
		ballotVotes.put( "Aakash Khan", 0 );
		ballotVotes.put( "Marion Wells", 0 );
		ballotVotes.put( "Damien Yu", 0 );
	}

	public static synchronized Candidates getInstance() {
		if ( candidates == null ) {
			candidates = new Candidates();
		}
		return candidates;
	}
	
	public List<String> getBallotNames() {
		return new ArrayList<String> ( ballotVotes.keySet() );
	}
	
	public int getVotes( String name ) throws VotingException {
		if( ballotVotes.get( name ) == null ) {
			throw new VotingException("Candidate name " + name + " not regonized");
		}
		return ballotVotes.get( name );
	}
	
	public void voteFor( String name ) throws VotingException {
		int votes = getVotes( name ) + 1;
		ballotVotes.put( name , votes );		
	}
	
	public void printVoteCount( PrintStream out ) {
		out.print("Vote count so far: ");
		for ( String s : getBallotNames() ) {
			out.printf("[%-12s%4d] ", s, ballotVotes.get(s) );
		}
		out.println();
	}
	
}
