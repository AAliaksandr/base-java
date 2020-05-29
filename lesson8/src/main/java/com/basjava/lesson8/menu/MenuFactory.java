package com.basjava.lesson8.menu;


import com.basjava.lesson8.menu.item.MainMenuAction;
import com.basjava.lesson8.menu.item.MenuItem;

import java.util.LinkedList;
import java.util.List;

import static com.basjava.lesson8.menu.MainMenuTextConst.*;

public class MenuFactory {



    public static List<MenuItem> getMainMenu(MainMenuAction... menuActions) {
        LinkedList<MenuItem> linkedList = new LinkedList<>();
        for (int i = 0; i < menuActions.length; i++) {
            MenuItem menuItem = getMainMenuItem(i, menuActions[i]);
            if (menuItem != null) {
                linkedList.add(menuItem);
            }
        }
        return linkedList;
    }

    private static MenuItem getMainMenuItem(int ind, MainMenuAction mainMenuAction) {
        switch (mainMenuAction) {
            case READ_FILE:
                return new MenuItem(ind, ITEM_TEXT_READ_FILES);
            case ADD_FILE:
                return new MenuItem(ind, ITEM_TEXT_ADD_FILE);
            case DELETE_FILE:
                return new MenuItem(ind, ITEM_TEXT_DELETE_FILE);
            case ADD_NEW_ENTRIES:
                return new MenuItem(ind, ITEM_TEXT_ADD_NEW_ENTRIES);
            case BACKUP_FILE:
                return new MenuItem(ind, ITEM_TEXT_BACKUP_FILE);
            case RESTORE_FILE:
                return new MenuItem(ind, ITEM_TEXT_RESTORE_FILE);
            case EXIT:
                return new MenuItem(ind, ITEM_TEXT_EXIT);
        }
        return null;
    }

    private MenuFactory() {
    }
}
