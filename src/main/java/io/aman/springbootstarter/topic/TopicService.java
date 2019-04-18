package io.aman.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

        private List<Topic> topics = new ArrayList<>(Arrays.asList(
                new Topic("JavaScript", "Spring Framework", "Spring Description"),
                new Topic("Spring", "Spring Framework", "Spring Description"),
                new Topic("Spring", "Spring Framework", "Spring Description"),
                new Topic("Spring", "Spring Framework", "Spring Description")
        ));

        public List<Topic> getAllTopics(){
            return topics;
        }

        public Topic getTopic(String id){
            return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
        }

        public void addTopic(Topic topic){
            topics.add(topic);
        }

        public void updateTopic(Topic topic, String id){

            for (int i =0; i<topics.size(); i++){
                Topic t = topics.get(i);
                if (t.getId().equals(id)){
                    topics.set(i, topic);
                }
                return;
            }
        }

    public void deleteTopic(Topic topic, String id){

       topics.removeIf(t -> t.getId().equals(id));
    }


}
