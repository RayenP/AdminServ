package com.rayen.admin.response;

import com.rayen.admin.pojo.ServerStatus;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetServerStatusResponse{
    private ServerStatus status;

    public GetServerStatusResponse(){
        this.status = new ServerStatus();
    }
}