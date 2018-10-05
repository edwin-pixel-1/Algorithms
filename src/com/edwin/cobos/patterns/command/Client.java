package com.edwin.cobos.patterns.command;

import com.edwin.cobos.patterns.command.square.commands.CommandManager;
import com.edwin.cobos.patterns.command.square.Square;
import com.edwin.cobos.patterns.command.square.commands.Create;
import com.edwin.cobos.patterns.command.square.commands.MoveHorizontal;
import com.edwin.cobos.patterns.command.square.commands.Scale;

import java.util.Scanner;

public class Client {

    private CommandManager commandManager;

    private Square square = null;

    public Client() {
        commandManager = new CommandManager();
        Scanner console = new Scanner(System.in);
        int option = 0;
        do {
            System.out.println("---------------------------------------------------------");
            System.out.println("1. Create a Square size 5");
            System.out.println("2. Create a Square size 8");
            System.out.println("3. Move square 2 spaces right");
            System.out.println("4. Move square 2 spaces left");
            System.out.println("5. Increase scale by 0.5");
            System.out.println("6. Decrease scale by 0.5");
            System.out.println("9. Undo");
            System.out.println("0. Exit");


            if(applyActions(option) && option > 0) {
                System.out.print(square.toString());
            }
            System.out.print("Enter an option: ");
            option = console.nextInt();
            System.out.println("---------------------------------------------------------");
            System.out.print("\n");
        }while (option != 0);
    }



    private boolean applyActions(int option) {
        if(option > 2 && square == null) {
            System.out.println("Please create an square first!!!");
            return false;
        }

        switch (option) {
            case 1:
                Create create = new Create(5);
                commandManager.executeCommand(create);
                square = create.getSquare();
                break;
            case 2:
                create = new Create(8);
                commandManager.executeCommand(create);
                square = create.getSquare();
                break;
            case 3:
                commandManager.executeCommand(new MoveHorizontal(square, 2));
                break;
            case 4:
                commandManager.executeCommand(new MoveHorizontal(square, -2));
                break;
            case 5:
                commandManager.executeCommand(new Scale(square, 0.5f));
                break;
            case 6:
                commandManager.executeCommand(new Scale(square, -0.5f));
                break;
            case 9:
                commandManager.undo();
                break;
        }
        return true;
    }

    public static void main(String[] args) {
        new Client();
    }
}
