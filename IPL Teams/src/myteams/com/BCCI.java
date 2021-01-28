package myteams.com;

import java.util.Scanner;

public class BCCI {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		IPLTeam DC = new IPLTeam("Delhi Capitals", "Shreyas Iyer", "GMR Group, JSW Group‎", "Ricky Ponting", "Delhi");
		IPLTeam.Players dcPlayer[] = new IPLTeam.Players[10];

		dcPlayer[0] = new IPLTeam.Players("Shreyas Iyer", "Indian", "6 December 1994", 26, "Batsmen");
		dcPlayer[1] = new IPLTeam.Players("Shikhar Dhawan", "Indian", "5 December 1985", 35, "Batsmen");
		dcPlayer[2] = new IPLTeam.Players("Ajinkya Rahane", "Indian", "5 June 1988", 32, "Batsmen");
		dcPlayer[3] = new IPLTeam.Players("Shimron Hetmyer", "West-IND", "26 December 1996", 24, "All-rounder");
		dcPlayer[4] = new IPLTeam.Players("Marcus Stoinis", "Australian", "16 August 1989", 31, "All-rounder");
		dcPlayer[5] = new IPLTeam.Players("Rishabh Pant", "Indian", "4 October 1997", 23, "Wicket-keeper");
		dcPlayer[6] = new IPLTeam.Players("Kagiso Rabada", "South-African", "25 May 1995", 25, "Pace Bowlers");
		dcPlayer[7] = new IPLTeam.Players("Anrich Nortje", "South-African", "16 November 1993", 27, "Pace Bowlers");
		dcPlayer[8] = new IPLTeam.Players("Ravichandran Ashwin", "Indian", "17 September 1986", 34, "Spin Bowler");
		dcPlayer[9] = new IPLTeam.Players("Amit Mishra", "Indian", "24 November 1982", 38, "Spin Bowler");

		IPLTeam SRH = new IPLTeam("Sunrisers Hyderabad", "David Warner", "Kalanithi Maran, Sun TV Network",
				"Trevor Bayliss", "Hyerabad, Telangana");
		IPLTeam.Players srhPlayer[] = new IPLTeam.Players[10];

		srhPlayer[0] = new IPLTeam.Players("David Warner", "Australian", "27 October 1986", 34, "Batsmen");
		srhPlayer[1] = new IPLTeam.Players("Manish Pandey", "Indian", "10 September 1989", 31, "Batsmen");
		srhPlayer[2] = new IPLTeam.Players("Kane Williamson", "Australian", "8 August 1990", 30, "Batsmen");
		srhPlayer[3] = new IPLTeam.Players("Rashid Khan", "Afganisthan", "20 September 1998", 22, "All-rounder");
		srhPlayer[4] = new IPLTeam.Players("T. Natarajan", "Indian", "27 May 1991", 29, "Pace Bowlers");
		srhPlayer[5] = new IPLTeam.Players("Bhuvneshwar Kumar", "Indian", "5 February 1990", 30, "Pace Bowlers");
		srhPlayer[6] = new IPLTeam.Players("Sandeep Sharma", "Indian", "18 May 1993", 27, "Pace Bowlers");
		srhPlayer[7] = new IPLTeam.Players("Wriddhiman Saha", "Indian", "24 October 1984", 36, "Wicket-keepers");
		srhPlayer[8] = new IPLTeam.Players("Jonny Bairstow", "England", "26 September 1989", 31, "Wicket-keepers");
		srhPlayer[9] = new IPLTeam.Players("Jason Holder", "West-IND", "5 November 199", 29, "All-rounders");

		IPLTeam.TeamRuns srhRuns[] = new IPLTeam.TeamRuns[6];

		srhRuns[0] = new IPLTeam.TeamRuns("David Warner", 56);
		srhRuns[1] = new IPLTeam.TeamRuns("Manish Pandey", 72);
		srhRuns[2] = new IPLTeam.TeamRuns("Kane Williamson", 44);
		srhRuns[3] = new IPLTeam.TeamRuns("Rashid Khan", 46);
		srhRuns[4] = new IPLTeam.TeamRuns("Jason Holder", 36);
		srhRuns[5] = new IPLTeam.TeamRuns("Wriddhiman Saha", 36);

		IPLTeam.TeamRuns dcRuns[] = new IPLTeam.TeamRuns[5];

		dcRuns[0] = new IPLTeam.TeamRuns("Shreyas Iyer", 86);
		dcRuns[1] = new IPLTeam.TeamRuns("Shikhar Dhawan", 16);
		dcRuns[2] = new IPLTeam.TeamRuns("Ajinkya Rahane", 56);
		dcRuns[3] = new IPLTeam.TeamRuns("Rishabh Pant", 91);
		dcRuns[4] = new IPLTeam.TeamRuns("Marcus Stoinis", 46);

		for (int k = 0; k < 6; k++)
			SRH.addTeamRun(srhRuns[k]);

		for (int k = 0; k < 5; k++)
			DC.addTeamRun(dcRuns[k]);

		IPLTeam.TeamRuns srhWickets[] = new IPLTeam.TeamRuns[5];

		srhWickets[0] = new IPLTeam.TeamRuns(1, "Bhuvneshwar Kumar");
		srhWickets[1] = new IPLTeam.TeamRuns(2, "Rashid Khan");
		srhWickets[2] = new IPLTeam.TeamRuns(1, "T. Natarajan");
		srhWickets[3] = new IPLTeam.TeamRuns(1, "Amit Mishra");
		srhWickets[4] = new IPLTeam.TeamRuns(1, "Marcus Stoini");

		for (int w = 0; w < 5; w++)
			SRH.addTeamWicket(srhWickets[w]);

		IPLTeam.TeamRuns dchWickets[] = new IPLTeam.TeamRuns[5];

		dchWickets[0] = new IPLTeam.TeamRuns(2, "Kagiso Rabada");
		dchWickets[1] = new IPLTeam.TeamRuns(1, "Ravichandran Ashwin");
		dchWickets[2] = new IPLTeam.TeamRuns(1, "Anrich Nortje");
		dchWickets[3] = new IPLTeam.TeamRuns(1, "Sandeep Sharma");
		dchWickets[4] = new IPLTeam.TeamRuns(0, "Jason Holder");

		for (int w = 0; w < 5; w++)
			DC.addTeamWicket(dchWickets[w]);

		int choice;
		int t;
		char exit = 'a';

		System.out.println(
				"Default 2 teams 1. Delhi Capitals 2.  Sunrisers Hyderabad \n Enter 1. for Add team Delhi Capitals or 2. for add team Sunrisers Hyderabad ");
		t = sc.nextInt();

		if (t == 1)
			DC.showTeamDeatails();
		else
			SRH.showTeamDeatails();

		do {

			System.out.println("\n------------Welcome to Indian Premier League--------------------------\n");

			System.out.print(
					"Enter your choice : \n 1.Add a Player to a team \n 2.Display list of teams sorted by name \n ");

			System.out.print(
					"3.Display list of players in a team sorted by name \n 4.Display total number of players per team");

			System.out.print(
					"\n 5.Display total number of teams in a system \n 6.Search team by name \n 7.Search player by name \n");

			System.out.println(" 8.Team-Runs \n 9. Team-Wickets \n 10. Results \n 11. Exit");
			choice = sc.nextInt();

			switch (choice) {

			case 1:

				if (t == 1)
					for (int i = 0; i < 10; i++)
						DC.addPlayer(dcPlayer[i], 10);
				else
					for (int i = 0; i < 10; i++)
						SRH.addPlayer(srhPlayer[i], 10);

				System.out.println("players added");

				break;

			case 2:

				if (t == 1)
					DC.sortTeams();
				else
					SRH.sortTeams();

				break;

			case 3:

				if (t == 1)
					DC.sortedByNameList();
				else
					SRH.sortedByNameList();

				break;

			case 4:

				if (t == 1)
					DC.totalNumberOfPlayers();
				else
					SRH.totalNumberOfPlayers();

				break;

			case 5:

				if (t == 1)
					DC.showTeam();
				else
					SRH.showTeam();

				break;

			case 6:

				if (t == 1)
					DC.searchTeamByName();
				else
					SRH.searchTeamByName();

				break;

			case 7:

				if (t == 1)
					DC.serachPlayerByName();
				else
					SRH.serachPlayerByName();

				break;

			case 8:
				if (t == 1)
					DC.showTeamRuns();
				else
					SRH.showTeamRuns();

				break;

			case 9:
				if (t == 1)
					DC.showWickets();
				else
					SRH.showWickets();

				break;

			case 10:

				int srhRun = SRH.showTeamRuns();
				int dcRun = DC.showTeamRuns();

				if (srhRun > dcRun)
					System.out.println("Sunrisers Hyderabad Won the match ");
				else
					System.out.println("Delhi Capitals Won the match ");

				break;

			case 11:

				System.out.println("Exited");
				exit = 'e';

				break;

			default:
				System.out.println("Enter valid choice :");

			}// end switch

		} while (exit != 'e');

	}

}
