package com.basjava.lesson8.menu.item;

import com.basjava.lesson8.exception.MenuActionException;

public enum MainMenuAction {
    READ_FILE, ADD_FILE, DELETE_FILE, ADD_NEW_ENTRIES, BACKUP_FILE, RESTORE_FILE, EXIT;

    public static MainMenuAction getMainMenuAction(int actionNumber) throws MenuActionException {
        MainMenuAction[] valuesArr = values();
        if (actionNumber >=0 && actionNumber < valuesArr.length) {
            return valuesArr[actionNumber];
        }
        throw new MenuActionException("Wrong action number");
    }
}
