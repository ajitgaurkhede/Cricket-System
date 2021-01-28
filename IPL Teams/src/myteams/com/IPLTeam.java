package myteams.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Scanner;

class IPLTeam {

	private String teamName;
	private String Captain;
	private String Owners;
	private String Coaches;
	private String city;
	private static int totalNumberOfTeam = 0;

	private static LinkedHashSet<String> iplTeams = new LinkedHashSet<String>();
	private LinkedHashSet<Players> teamPlayer = new LinkedHashSet<Players>();
	private LinkedHashSet<TeamRuns> teamRuns = new LinkedHashSet<TeamRuns>();
	private LinkedHashSet<TeamRuns> teamWickets = new LinkedHashSet<TeamRuns>();

	Scanner scan = new Scanner(System.in);

	IPLTeam(String teamName, String Captain, String Owners, String Coaches, String city) {

		this.teamName = teamName;
		this.Captain = Captain;
		this.Owners = Owners;
		this.Coaches = Coaches;
		this.city = city;

		iplTeams.add(teamName);
		totalNumberOfTeam++;

	}

	static class Players implements Comparable<Players> {

		private String playerName;
		private String Nationality;
		private String DOB;
		private int age;
		private String Role;

		Players(String playerName, String Nationality, String DOB, int age, String Role) {

			this.playerName = playerName;
			this.Nationality = Nationality;
			this.DOB = DOB;
			this.age = age;
			this.Role = Role;
		}

		@Override
		public int compareTo(Players pl) {

			if (playerName == pl.playerName)
				return 0;
			else if (playerName.compareToIgnoreCase(pl.playerName) > 0)
				return 1;
			else
				return -1;
		}

	}

	static class TeamRuns {

		private String playerName;
		private int playerRuns;

		TeamRuns(String playerName, int playerRuns) {

			this.playerName = playerName;
			this.playerRuns = playerRuns;

		}

		private String bowler;
		private int wickets;

		TeamRuns(int wickets, String bowler) {

			this.wickets = wickets;
			this.bowler = bowler;

		}

	}

	void showTeamDeatails() {

		System.out.println("Team Name : " + teamName + "\n" + "Captain : " + Captain + "\n" + "Owners : " + Owners
				+ "\n" + "Coaches : " + Coaches + "\n" + "City : " + city + "\n");
	}

	void showTeam() {

		System.out.println(iplTeams);

		System.out.println("total no of teams : " + totalNumberOfTeam);

		System.out.println();

	}

	void sortTeams() {

		ArrayList<String> sortTeams = new ArrayList<String>(iplTeams);

		Collections.sort(sortTeams);

		System.out.println("Teams Name in Sorted Order by Name : " + "\n");

		for (String str : sortTeams) {

			System.out.println(str);

		}

	}

	void searchTeamByName() {

		System.out.println("Enter team Name : ");
		String name = scan.nextLine();

		if (iplTeams.contains(name))
			System.out.println("Team Founded : " + name);
		else
			System.out.println("Not Found");

		System.out.println(iplTeams);
	}

	void addPlayer(Players p, int n) {

		Players pl[] = new Players[n];

		for (int i = 0; i < n; i++) {
			pl[i] = p;
			teamPlayer.add(pl[i]);
		}

	}

	void showTeamPlayerList() {

		LinkedHashSet<Players> dcPlayer = teamPlayer;
		int i = 0;
		System.out.println("--------------------------**Player List**------------------------------" + "\n");

		for (Players p : dcPlayer) {
			i++;
			System.out.println(i + " Player Name : " + p.playerName + "\t" + "DOB : " + p.DOB + "\t" + "Role : "
					+ p.Role + "\t" + "Age :" + p.age + "\t" + "Nationality : " + p.Nationality + "\n");
		}

	}

	void serachPlayerByName() {

		LinkedHashSet<Players> dcPlayer = teamPlayer;
		System.out.println("Enter Player Name : ");
		String name = scan.nextLine();
		int i = 0;

		for (Players ply : dcPlayer) {
			if (ply.playerName.equals(name)) {
				i = 1;
				break;
			} else if (ply.playerName.equals(name) == false) {
				i = 0;
			}

		}
		if (i == 1)
			System.out.println("Player Founded : " + name);
		else
			System.out.println("not found");

	}

	void sortedByNameList() {

		LinkedHashSet<Players> dcPlayer = teamPlayer;
		ArrayList<Players> sortPlayer = new ArrayList<Players>(dcPlayer);
		Collections.sort(sortPlayer);
		System.out.println("Player's List Sorted by name : " + "\n");
		int i = 0;
		for (Players it : sortPlayer) {
			i++;
			System.out.println(i + " Player Name : " + it.playerName + "\t" + "DOB : " + it.DOB + "\t" + "Role : "
					+ it.Role + "\t" + "Age :" + it.age + "\t" + "Nationality : " + it.Nationality + "\n");
		}

	}

	void totalNumberOfPlayers() {
		System.out.println("Total Number of Players : " + teamPlayer.size() + "\n");
	}

	void addTeamRun(TeamRuns r) {
		teamRuns.add(r);
	}

	void addTeamWicket(TeamRuns w) {
		teamWickets.add(w);
	}

	int showTeamRuns() {

		int total = 0;
		for (TeamRuns run : teamRuns) {
			System.out.println(run.playerName + " Runs : " + run.playerRuns);
			total = total + run.playerRuns;
		}
		System.out.println("Total Runs : " + total + "\n");
		return total;
	}

	void showWickets() {

		int total = 0;
		for (TeamRuns wicket : teamWickets) {
			System.out.println(wicket.bowler + " Wickets : " + wicket.wickets);
			total = total + wicket.wickets;
		}

		System.out.println("Total wickets : " + total + "\n");

	}

}
