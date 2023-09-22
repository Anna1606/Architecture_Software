package LogicLevel;

import DataLevel.ITripHistory;

/**
 * Контроллер маршрута
 *
 * Реализует методы от интерфеса GPS-сенсора по получению и обработке GPS-данных о движении пользователя
 *
 * Реализует методы интерфейса сохранённых маршрутов пользователя
 *
 * Взаимодействует (зависит от) с сетевым контроллером,
 * получает от него данные о дорогах, пробках, камерах
 */
public class TripController implements IGpsSensor, ITripHistory {
}
