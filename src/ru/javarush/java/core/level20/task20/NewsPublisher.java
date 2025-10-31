package ru.javarush.java.core.level20.task20;

import java.util.ArrayList;
import java.util.List;

public class NewsPublisher {
   private List<Subscriber> subscribers = new ArrayList<>();

   public void addSubscriber(Subscriber subscriber) {
       subscribers.add(subscriber);
   }

   public void removeSubscriber(Subscriber subscriber) {
       subscribers.remove(subscriber);
   }

   public void notifySubscribers(String news) {
       for (Subscriber s : subscribers) {
           s.update(news);
       }
   }
}